package pageUIs.wordpress.admin;

public class AdminPostAddNewPageUI {
	
	public static final String TITLE_TEXTBOX = "xpath=//h1[@aria-label='Add title']";
	public static final String BODY_BUTTON = "css=p[class*='block-editor-default']";
	public static final String BODY_TEXTBOX = "css=p.block-editor-rich-text__editable";
	public static final String PUBLISH_BUTTON = "css=div[aria-label='Editor top bar'] button[class*='editor-post-publish']";
	public static final String PRE_PUBLISH_BUTTON = "css=div[aria-label='Editor publish'] button[class*='editor-post-publish']";
	public static final String PUBLISHED_MESSAGE = "xpath=//div[@class='components-snackbar__content' and text()='%s']";

}
