class Solution {
    public char kthCharacter(long k, int[] operations) {
        StringBuilder sb = new StringBuilder("a");
        int n = operations.length;

        for (int i = 0; i < n; i++) {
            if (operations[i] == 0) {
                sb.append(sb);
            } else if (operations[i] == 1) {
                if ((long) sb.length() >= k) return sb.charAt((int)(k - 1));

                int currentLength = sb.length(); // Avoid length changing during loop
                for (int j = 0; j < currentLength; j++) {
                    char ch = sb.charAt(j);

                    if ((long) sb.length() >= k) return sb.charAt((int)(k - 1));

                    if (ch == 'z') {
                        sb.append('a');
                    } else {
                        sb.append((char) (ch + 1));
                    }

                    if ((long) sb.length() >= k) return sb.charAt((int)(k - 1));
                }
            }
        }

        return sb.charAt((int)(k - 1));
    }
}
