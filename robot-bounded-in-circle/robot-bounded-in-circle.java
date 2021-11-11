class Solution {
    public boolean isRobotBounded(String instructions) {
        int x = 0; 
        int y = 0;
        String direction = "North";
        
        for(char i : instructions.toCharArray()) {
            if(i == 'G') {
                if(direction.equals("North")) {
                    y++;
                } else if(direction.equals("South")) {
                    y--;
                } else if(direction.equals("East")) {
                    x++;
                } else {
                    x--;
                }
            } else if (i == 'L') {
                if(direction.equals("North")) {
                    direction = "West";
                } else if(direction.equals("South")) {
                    direction = "East";
                } else if(direction.equals("East")) {
                    direction = "North";
                } else {
                    direction = "South";
                }
            } else {
                if(direction.equals("North")) {
                    direction = "East";
                } else if(direction.equals("South")) {
                    direction = "West";
                } else if(direction.equals("East")) {
                    direction = "South";
                } else {
                    direction = "North";
                }
            }
        }
        if (x == 0 && y == 0) {
            return true;
        } else if(direction.equals("North")) {
            return false;
        }
        return true;
    }
}