class Solution {
    public String reformatDate(String date) {
        HashMap<String, String> map = new HashMap<>();
        
        map.put("Jan","01");
        map.put("Feb","02");
        map.put("Mar","03");
        map.put("Apr","04");
        map.put("May","05");
        map.put("Jun","06");
        map.put("Jul","07");
        map.put("Aug","08");
        map.put("Sep","09");
        map.put("Oct","10");
        map.put("Nov","11");
        map.put("Dec","12");
        
        String day = date.split(" ")[0];
        String month = date.split(" ")[1];
        String year = date.split(" ")[2];
        
        day = String.valueOf(Integer.parseInt(day.replaceAll("\\D", "")));
        if (day.length() == 1) {
            day = 0 + day;
        }
        return year + "-" + map.get(month) + "-" + day;
    }
}