
public class Amazon implements CloudHostingProvider,CDNProvider,CloudStorageProvider {

	@Override
    public void storeFile(String name) {
        System.out.println("Amazon: Storing file " + name);
    }

    @Override
    public void getFile(String name) {
        System.out.println("Amazon: Retrieving file " + name);
    }

    @Override
    public void createServer(String region) {
        System.out.println("Amazon: Creating server in region " + region);
    }

    @Override
    public void listServers(String region) {
        System.out.println("Amazon: Listing servers in region " + region);
    }

    @Override
    public String getCDNAddress() {
        return "cdn.amazonaws.com";
    }
}
