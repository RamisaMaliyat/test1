package utils;

import aquality.selenium.browser.AqualityServices;
import com.google.gson.Gson;
import lombok.experimental.UtilityClass;
import models.Env;
import models.EnvData;
import models.FileData;

import java.io.FileNotFoundException;
import java.io.FileReader;

@UtilityClass
public class SettingsTestData {
    public static final String RESOURCE_FILE_PATH = "src/test/resources/";
    private static final String ENV_FILE_PATH = RESOURCE_FILE_PATH + "env.json";
    private static final String PROD_ENV_FILE_PATH = RESOURCE_FILE_PATH + "prodenv.json";
    private static final String FILE_DATA_PATH = RESOURCE_FILE_PATH + "fileData.json";
    private static final String ERROR_MSG = "File with environment settings not found or incorrect";
    private static Gson gson = new Gson();


    private static Env getEnvironment() {
        try {
            return gson.fromJson(new FileReader(ENV_FILE_PATH), Env.class);
        }
        catch (FileNotFoundException e) {
            AqualityServices.getLogger().error(ERROR_MSG);
            throw new RuntimeException(ERROR_MSG);
        }
    }

    public static EnvData getEnvData()
    {
        try {
            if (getEnvironment().getEnv().equals("prod")) {
                return gson.fromJson(new FileReader(PROD_ENV_FILE_PATH), EnvData.class);
            }
            AqualityServices.getLogger().info("Env is not set");
            throw new RuntimeException(ERROR_MSG);
        }
        catch (FileNotFoundException e) {
            AqualityServices.getLogger().error(ERROR_MSG);
            throw new RuntimeException(ERROR_MSG);
        }
    }

    public static FileData getFileData()
    {
        try
        {
            return gson.fromJson(new FileReader(FILE_DATA_PATH), FileData.class);
        }
        catch (FileNotFoundException e)
        {
            AqualityServices.getLogger().error(ERROR_MSG);
            throw new RuntimeException(ERROR_MSG);
        }
    }
}
