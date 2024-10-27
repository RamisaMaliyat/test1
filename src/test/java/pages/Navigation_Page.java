package pages;

public enum Navigation_Page
{
    Download_AS_PDF("Download as PDF"),
    Page_Information("Page information");

    public final String label;
    //Constructor
    Navigation_Page(String label)
    {

        this.label = label;
    }

    public static void getByLabel(String label)
    {
        for (Navigation_Page navigation : Navigation_Page.values())
        {
            if (navigation.label.equals(label)) {
                return;
            }
        }
        throw new IllegalArgumentException("No enum constant with label " + label);
    }
}
