class Solution {
    public String solution(String polynomial) {
        String[] nums = polynomial.split(" ");
        int nsum = 0;
        int xsum = 0;

        for(String n : nums) {
            if(n.equals("+")) {
                continue;
            }

            if(n.charAt(n.length() - 1) == 'x') {
                if(n.length() == 1) {
                    xsum++;
                } else {
                    xsum += Integer.parseInt(n.substring(0, n.length() - 1));
                }
            } else {
                nsum += Integer.parseInt(n);
            }
        }

        StringBuilder sb = new StringBuilder();
        if(xsum != 0) {
            if(xsum != 1) {
                sb.append(xsum);
            }
            sb.append("x");

            if(nsum != 0) {
                sb.append(" + " + nsum);
            }

            return sb.toString();
        }

        if(nsum == 0) {
            return "0";
        }

        return nsum + "";
    }
}
