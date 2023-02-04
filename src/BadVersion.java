public class BadVersion {

    boolean isBadVersion(int version) {
        return 7 <= version;
    }

    public int firstBadVersion(int n) {
        int l = 1, r = n, m;
        boolean bad;
        while (l < r) {
            m = l + (r - l) / 2;
            bad = isBadVersion(m);
            if (bad) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        BadVersion badVersion = new BadVersion();
        System.out.println(badVersion.firstBadVersion(1));
        System.out.println(badVersion.firstBadVersion(2));
        System.out.println(badVersion.firstBadVersion(3));
        System.out.println(badVersion.firstBadVersion(4));
        System.out.println(badVersion.firstBadVersion(5));
        System.out.println(badVersion.firstBadVersion(6));
        System.out.println(badVersion.firstBadVersion(7));
        System.out.println(badVersion.firstBadVersion(8));
        System.out.println(badVersion.firstBadVersion(9));
        System.out.println(badVersion.firstBadVersion(10));
        System.out.println(badVersion.firstBadVersion(11));
    }
}
