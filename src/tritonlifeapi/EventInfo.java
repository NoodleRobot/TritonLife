package tritonlifeapi;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author gwy96
 */
public class EventInfo {
    
    public String GetEventData(){
      
            String finalString = "{BEGIN:\"VEVENT\",\n";
            finalString = finalString + "\"SUMMARY\":\"Faculty Senate Meeting\",\n";
            finalString = finalString + "\"SEQUENCE\":\"0\",\n";
            finalString = finalString + "\"LOCATION\":\"202 J.C. Penney Building\",\n";
            finalString = finalString + "\"TRANSP\":\"OPAQUE\",\n";
            finalString = finalString + "\"DESCRIPTION\":\"The Faculty Senate meetings occur once a month from September through April.\",\n";
            finalString = finalString + "\"LAST-MODIFIED\":\"19700101T000000\",\n";
            finalString = finalString + "\"UID\":\"25a75b3780ce0e3603ed7cec07af5fcf\",\n";
            finalString = finalString + "\"DTSTAMP\":\"19700101T000000\",\n";
            finalString = finalString + "\"STATUS\":\"CONFIRMED\",\n";
            finalString = finalString + "\"DTSTART\":\"20170124T150000\",\n";
            finalString = finalString + "\"DTEND\":\"20170124T163000\",\n";
            finalString = finalString + "\"END\":\"VEVENT\"}\n";
            
            
            
                    



    return finalString;
            }
       
        }
    

