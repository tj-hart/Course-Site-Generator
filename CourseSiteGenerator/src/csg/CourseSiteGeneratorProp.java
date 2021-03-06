package csg;

/**
 * This enum provides a list of all the user interface
 * text that needs to be loaded from the XML properties
 * file. By simply changing the XML file we could initialize
 * this application such that all UI controls are provided
 * in another language.
 * 
 * @author Richard McKenna
 * @version 1.0
 */
public enum CourseSiteGeneratorProp {
    // FOR SIMPLE OK/CANCEL DIALOG BOXES
    OK_PROMPT,
    CANCEL_PROMPT,
    
    // THESE ARE FOR TEXT PARTICULAR TO THE APP'S WORKSPACE CONTROLS
    TAS_HEADER_TEXT,
    NAME_COLUMN_TEXT,
    UG_COLUMN_TEXT,
    EMAIL_COLUMN_TEXT,
    NAME_PROMPT_TEXT,
    EMAIL_PROMPT_TEXT,
    ADD_BUTTON_TEXT,
    UPDATE_BUTTON_TEXT,
    CLEAR_BUTTON_TEXT,
    OFFICE_HOURS_SUBHEADER,
    OFFICE_HOURS_TABLE_HEADERS,
    DAYS_OF_WEEK,
    SCHEDULE_ITEM_TYPES,
    COURSE_OPTIONS,
    
    // THESE ARE FOR ERROR MESSAGES PARTICULAR TO THE APP
    MISSING_TA_NAME_TITLE,
    MISSING_TA_NAME_MESSAGE,
    MISSING_TA_EMAIL_TITLE,
    MISSING_TA_EMAIL_MESSAGE,
    TA_NAME_AND_EMAIL_NOT_UNIQUE_TITLE,
    TA_NAME_AND_EMAIL_NOT_UNIQUE_MESSAGE,
    
    DELETE_TEXT,
    COURSE_INFO_TEXT,
    SUBJECT_TEXT,
    SEMESTER_TEXT,
    TITLE_TEXT,
    INSTRUCTOR_NAME_TEXT,
    INSTRUCTOR_HOME_TEXT,
    EXPORT_DIR_TEXT,
    SEMESTER_LIST,
    
    NUMBER_TEXT,
    YEAR_TEXT,
    CHANGE_BUTTON_TEXT,
    SITE_TEMPLATE_TEXT,
    SITE_TEMPLATE_DISC_TEXT,
    SELECT_TEMPLATE_BUTTON_TEXT,
    SITE_PAGES_TEXT,
    USE_COLUMN_TEXT,
    NAVBAR_COLUMN_TEXT,
    FILENAME_COLUMN_TEXT,
    SCRIPT_COLUMN_TEXT,
    
    PAGE_STYLE_TEXT,
    BANNER_SCHOOL_IMAGE_TEXT,
    LEFT_FOOTER_IMAGE_TEXT,
    RIGHT_FOOTER_IMAGE_TEXT,
    STYLESHEET_TEXT,
    STYLESHEET_DISC_TEXT,
    
    RECITATIONS_TEXT,
    SECTION_TEXT,
    INSTRUCTOR_TEXT,
    DAYTIME_TEXT,
    LOCATION_TEXT,
    TA_TEXT,
    ADDEDIT_TEXT,
    SUPERVISING_TA_TEXT,
    ADDUPDATE_TEXT,
    
    SCHEDULE_TEXT,
    CAL_BOUNDS_TEXT,
    STARTING_MON_TEXT,
    ENDING_FRI_TEXT,
    SCHEDULE_ITEMS_TEXT,
    TYPE_TEXT,
    DATE_TEXT,
    TOPIC_TEXT,
    TIME_TEXT,
    LINK_TEXT,
    CRITERIA_TEXT,
    TEAM_TEXT,
    TEAMS_TEXT,
    NAME_TEXT,
    COLOR_TEXT,
    TEXT_COLOR_TEXT,
    STUDENTS_TEXT,
    FIRSTNAME_TEXT,
    LASTNAME_TEXT,
    ROLE_TEXT,
    PROJECTS_TEXT,
    COURSE_DETAILS_TEXT,
    TA_DATA_TEXT,
    RECITATION_DATA_TEXT,
    SCHEDULE_DATA_TEXT,
    PROJECT_DATA_TEXT,
    
    ADD_TEXT,
    UPDATE_TEXT,
    
    TEAM_NAME_NOT_UNIQUE_TITLE,
    TEAM_NAME_NOT_UNIQUE_MESSAGE,
    STUDENT_NAME_NOT_UNIQUE_TITLE,
    STUDENT_NAME_NOT_UNIQUE_MESSAGE,
    
    STARTING_DATE_ERROR_TITLE,
    STARTING_DATE_ERROR1,
    STARTING_DATE_ERROR2,
    ENDING_DATE_ERROR_TITLE,
    ENDING_DATE_ERROR1,
    ENDING_DATE_ERROR2,
    ADD_RECITATION_ERROR_TITLE,
    ADD_RECITATION_ERROR1,
    ADD_RECITATION_ERROR2,
    ADD_RECITATION_ERROR3,
    
    ADD_SCHEDULE_ITEM_ERROR_TITLE,
    ADD_SCHEDULE_ITEM_ERROR1,
    ADD_SCHEDULE_ITEM_ERROR2,
    ADD_TEAM_ERROR_TITLE,
    ADD_TEAM_ERROR1,
    ADD_STUDENT_ERROR_TTILE,
    ADD_STUDENT_ERROR1,
    CHOOSE_EXPORT_DIR_TITLE,
    CHOOSE_TEMP_DIR_TITLE,
    TEMPLATE_ERROR_TITLE,
    TEMPLATE_ERROR1,
    TEMPLATE_ERROR2,
    SELECT_IMAGE,
    ABOUT_POPUP_TITLE,
    ABOUT1,
    ABOUT2,
    ABOUT3,
    ABOUT4,
    ABOUT5,
    CLOSE,
    IMAGE_FILE
}
