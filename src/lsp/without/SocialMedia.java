package lsp.without;

public abstract class SocialMedia {
	
	//@support whatsapp ,facebook ,instagram
	public abstract void chatWithFriends();
	//@support facebook ,instagram
	public abstract void publishPost(Object post);
	//@support whatsapp ,facebook ,instagram
	public abstract void sendPhotosAndVideos();
	//@support whatsapp ,facebook 
	public abstract void groupVideoCall(String... users);
	

}
