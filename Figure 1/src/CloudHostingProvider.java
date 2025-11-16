
public interface CloudHostingProvider {

	void createServer(String region);
    void listServers(String region);
    
}
