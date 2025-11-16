public class main1 {
	
	public static void main(String[] args) {
		
		Amazon amazon = new Amazon();
        amazon.storeFile("project.zip");
        amazon.getFile("report.pdf");
        amazon.createServer("US-East");
        amazon.listServers("US-East");
        System.out.println("Amazon CDN Address: " + amazon.getCDNAddress());

        System.out.println("\n--------------------\n");

        DropBox dropbox = new DropBox();
        dropbox.storeFile("photo.png");
        dropbox.getFile("resume.docx");
	}
}
