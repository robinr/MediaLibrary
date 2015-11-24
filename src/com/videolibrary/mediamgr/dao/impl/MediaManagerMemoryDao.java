package com.videolibrary.mediamgr.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.videolibrary.mediamgr.dao.MediaManagerDao;
import com.videolibrary.mediamgr.model.Media;
import com.videolibrary.mediamgr.model.MediaRequest;
import com.videolibrary.mediamgr.model.MediaResponse;
import com.videolibrary.mediamgr.model.PlayList;
import com.videolibrary.mediamgr.model.PlayListResponse;

public class MediaManagerMemoryDao implements MediaManagerDao {

	private Integer mediaIndex = 0;
	
	List<Media> Medialist = new ArrayList<Media>();
	
	List<PlayList> alllist = new ArrayList<PlayList>();
	
	public Integer getMediaIndex() {
		return mediaIndex;
	}


	public void setMediaIndex(Integer mediaIndex) {
		this.mediaIndex = mediaIndex;
	}


	public List<Media> getMedialist() {
		return Medialist;
	}


	public void setMedialist(List<Media> medialist) {
		Medialist = medialist;
	}


	public List<PlayList> getAlllist() {
		return alllist;
	}


	public void setAlllist(List<PlayList> alllist) {
		this.alllist = alllist;
	}


	public MediaManagerMemoryDao(){
		
		Media media1,media2,media3,media4,media5; // English
		Media media6,media7,media8,media9,media10; // Hindi
		Media media11,media12,media13,media14,media15; // Kannada
		Media media16,media17,media18,media19,media20; // Tamil
		
		media1 = new Media();
		media1.setId(++mediaIndex);
		media1.setLanguage("English");
		media1.setPoster("12-years-a-slave.jpg");
		media1.setActors("Stars: Chiwetel Ejiofor, Michael Kenneth Williams, Michael Fassbender");
		media1.setSynopsis("In the antebellum United States, Solomon Northup, a free black man from upstate New York, is abducted and sold into slavery.");
		media1.setDirector("Director: Steve McQueen");
		media1.setName("12 Years a Slave");
		media1.setDuration(95);
		Medialist.add(media1);
		
		media2 = new Media();
		media2.setId(++mediaIndex);
		media2.setLanguage("English");
		media2.setPoster("A_Beautiful_Mind.jpg");
		media2.setActors("Stars: Russell Crowe, Ed Harris, Jennifer Connelly");
		media2.setSynopsis("After a brilliant but asocial mathematician accepts secret work in cryptography, his life takes a turn for the nightmarish.");
		media2.setDirector("Director : Ron Howard");
		media2.setName("A Beautiful Mind");
		media2.setDuration(100);
		Medialist.add(media2);
		
		media3 = new Media();
		media3.setId(++mediaIndex);
		media3.setLanguage("English");
		media3.setPoster("avengers-2-age-of-ultron.jpg");
		media3.setActors("Stars: Robert Downey Jr., Chris Evans, Mark Ruffalo ");
		media3.setSynopsis("When Tony Stark and Bruce Banner try to jump-start a dormant peacekeeping program called Ultron, things go horribly wrong and it's up to Earth's Mightiest Heroes to stop the villainous Ultron from enacting his terrible plans");
		media3.setDirector("Director : Joss Whedon");
		media3.setName("Avengers2");
		media3.setDuration(95);
		Medialist.add(media3);
		
		media4 = new Media();
		media4.setId(++mediaIndex);
		media4.setLanguage("English");
		media4.setPoster("Cars2.jpeg");
		media4.setActors("Stars: Owen Wilson, Larry the Cable Guy, Michael Caine ");
		media4.setSynopsis(" Star race car Lightning McQueen and his pal Mater head overseas to compete in the World Grand Prix race. But the road to the championship becomes rocky as Mater gets caught up in an intriguing adventure of his own: international espionage.");
		media4.setDirector("Director : John Lasseter, Brad Lewis");
		media4.setName("Cars2");
		media4.setDuration(110);
		Medialist.add(media4);
		
		media5 = new Media();
		media5.setId(++mediaIndex);
		media5.setLanguage("English");
		media5.setPoster("Deception.jpg");
		media5.setActors("Stars: Hugh Jackman, Ewan McGregor, Michelle Williams");
		media5.setSynopsis("An accountant is introduced to a mysterious sex club known as The List by his lawyer friend. But in this new world, he soon becomes the prime suspect in a woman's disappearance and a multi-million dollar heist.");
		media5.setDirector("Director: Marcel Langenegger");
		media5.setName("Deception");
		media5.setDuration(90);
		Medialist.add(media5);
		
		media6 = new Media();
		media6.setId(++mediaIndex);
		media6.setLanguage("Hindi");
		media6.setPoster("2-States.jpg");
		media6.setActors("Stars: Arjun Kapoor, Alia Bhatt, Amrita Singh");
		media6.setSynopsis("How Chetan met his wife and the difficulties they faced in getting married due to their cultural differences.");
		media6.setDirector("Director: Abhishek Varman");
		media6.setName("2-States");
		media6.setDuration(110);
	    Medialist.add(media6);
	    
	    media7 = new Media();
	    media7.setId(++mediaIndex);
		media7.setLanguage("Hindi");
		media7.setPoster("3-idiots.jpg");
		media7.setActors("Stars: Aamir Khan, Madhavan, Sharman Joshi,Mona Singh, Kareena Kapoor");
		media7.setSynopsis("Two friends are searching for their long lost companion. They revisit their college days and recall the memories of their friend who inspired them to think differently, even as the rest of the world called them \"idiots\".");
		media7.setDirector("Director:Rajkumar Hirani");
		media7.setName("3-Idiots");
		media7.setDuration(120);
	    Medialist.add(media7);
	    
	    media8 = new Media();
	    media8.setId(++mediaIndex);
		media8.setLanguage("Hindi");
		media8.setPoster("Bhaag-Milkha-Bhaag.jpg");
		media8.setActors("Stars: Farhan Akhtar, Sonam Kapoor, Pavan Malhotra");
		media8.setSynopsis("The truth behind the ascension of Milkha \"The Flying Sikh\" Singh who was scarred because of the India-Pakistan partition.");
		media8.setDirector("Director: Rakeysh Omprakash Mehra");
		media8.setName("Bhaag Milkha Bhaag");
		media8.setDuration(120);
	    Medialist.add(media8);
	    
	    media9 = new Media();
	    media9.setId(++mediaIndex);
		media9.setLanguage("Hindi");
		media9.setPoster("Chennai-Express.jpg");
		media9.setActors("Stars : Deepika Padukone, Shah Rukh Khan, Satyaraj");
		media9.setSynopsis("What could have been a sad journey turns joyful for Rahul when he falls in love with a woman en route to submerging his grandfather's ashes. ");
		media9.setDirector("Director: Rohit Shetty");
		media9.setName("Chennai Express");
		media9.setDuration(140);
	    Medialist.add(media9);
	    
	    media10 = new Media();
	    media10.setId(++mediaIndex);
		media10.setLanguage("Hindi");
		media10.setPoster("Delhi-6.jpg");
		media10.setActors("Stars: Waheeda Rehman, Abhishek Bachchan, Sonam Kapoor");
		media10.setSynopsis("A story about love, hope and self-discovery set in the walled city of Delhi (zip code 6) and its chaotic but touching life that forces us to ask questions about ourselves.");
		media10.setDirector("Director: Rakeysh Omprakash Mehra (as Rakesh Omprakash Mehra)");
		media10.setName("Delhi 6");
		media10.setDuration(120);
	    Medialist.add(media10);
	    
	    
	    media11 = new Media();
	    media11.setId(++mediaIndex);
		media11.setLanguage("Kannada");
		media11.setPoster("googly.jpg");
		media11.setActors("Stars: Yash, Kriti Kharbanda, Anant Nag");
		media11.setSynopsis("Googly is a Kannada romantic comedy directed by Pawan Wadeyar. The film won multiple nominations at the 3rd South Indian International Movie Awards. Sharath leads a carefree life, meets Swathi at one of the college events. Their friendship turns into a mutual attraction but hesitant to confess their feelings. Due to a small misunderstanding they part ways. Will they ever meet again? ");
		media11.setDirector("Director : Pawan Wadeyar");
		media11.setName("Googly");
		media11.setDuration(120);
	    Medialist.add(media11);
	    
	    media12 = new Media();
	    media12.setId(++mediaIndex);
		media12.setLanguage("Kannada");
		media12.setPoster("Maleyali-Jotheyali.jpg");
		media12.setActors("Stars: Ganesh, Yuvika Chaudhry, Anjana Sukhani");
		media12.setSynopsis("Preetham escapes from his wealthy father who's hounding him to get married after an astrologer tells that it will be good for the family and meets two interesting girls on his way.");
		media12.setDirector("Director: Preetham Gubbi");
		media12.setName("Maleyali Jotheyali");
		media12.setDuration(145);
	    Medialist.add(media12);
	    
	    media13 = new Media();
	    media13.setId(++mediaIndex);
		media13.setLanguage("Kannada");
		media13.setPoster("mr-420-Poster.jpg");
		media13.setActors("Star:  	Ganesh, Pranitha, Rangayana Raghu");
		media13.setSynopsis("Mr. 420 is a 2012 Indian Kannada romantic comedy film starring Ganesh and Pranitha Subhash in the lead. This film was directed by Pradeep Raj and produced by Sandesh Nagaraj under Sandesh films banner.[1] V. Harikrishna is the music composer and R. Giri is the cinematographer. The film made its theatrical release on 19 October 2012");
		media13.setDirector("Directed : Pradeep Raj");
		media13.setName("Mr 420");
		media13.setDuration(145);
	    Medialist.add(media13);
	   
	    media14 = new Media();
	    media14.setId(++mediaIndex);
		media14.setLanguage("Kannada");
		media14.setPoster("Topiwala.jpg");
		media14.setActors("Star :	Upendra, Bhavana, Raju Talikote");
		media14.setSynopsis("Beginning of the film is the aping of Shanker Nag style with background voice mimicry on the Swiss money of India. Upendra and his team liberally added 'zeroes' and again and again repeating that is not possible to get back black money in Swiss Bank tortures the brain.");
		media14.setDirector("Director : MG Srinivas");
		media14.setName("Topiwala");
		media14.setDuration(155);
	    Medialist.add(media14);
	    
	    media15 = new Media();
	    media15.setId(++mediaIndex);
		media15.setLanguage("Kannada");
		media15.setPoster("victory.jpg");
		media15.setActors("Star: Sharan, Asmita Sood, Avinash,Ravishankar");
		media15.setSynopsis("The film starts with Chandru (Sharan) marrying Priya (Asmita Sood) and on the very first night of their marriage they get separated. Dejected by this, Chandru attempts suicide several times, but in vain. He then hires a local Don (Ravishankar) and gives him a week's time to kill him. Meanwhile, Priya returns to Chandru realizing her mistakes and wants to live with him. But the don is reluctant to kill Chandru as per the contract and would not spare him. What follows is the comical twists and turns about how Chandru escapes from the don and re-unites with Priya.");
		media15.setDirector("Director: Nanda Kishore");
		media15.setName("Victory");
		media15.setDuration(135);
	    Medialist.add(media15);
	    
	    media16 = new Media();
	    media16.setId(++mediaIndex);
		media16.setLanguage("Tamil");
		media16.setPoster("7aamarivu.jpg");
		media16.setActors("Stars: Suriya, Shruti K. Haasan, Johnny Nguyen");
		media16.setSynopsis("A genetic engineering student tries to bring back the skills of a legend of the past and use his skills to save India from a deadly virus attack by China.");
		media16.setDirector("Director: A.R. Murugadoss");
		media16.setName("7am Arivu");
		media16.setDuration(135);
	    Medialist.add(media16);
	    
	    media17 = new Media();
	    media17.setId(++mediaIndex);
	  	media17.setLanguage("Tamil");
	  	media17.setPoster("I.jpg");
	  	media17.setActors("Star :Vikram, Amy Jackson, Suresh Gopi");
	  	media17.setSynopsis("Lingesan (Vikram) is a bodybuilder from the suburbs of Chennai, whose main ambition is to become Mr. India. He wins the title of Mr. Tamil Nadu, which gives him entry to the Mr. India pageant. He is infatuated by Diya (Amy Jackson), a leading supermodel. Diya is soon blacklisted and all her advertisement film contracts are cancelled by popular model John (Upen Patel), her co-star in all her advertisements, after she had constantly refused to have sex with him. To save her career, Diya decides to replace John with Lingesan, whom she had earlier met at one of her shoots, as her co-star for her next advertisement. Lingesan agrees, sacrificing his Mr. India dreams in the process.");
	  	media17.setDirector("Director: Shankar");
	  	media17.setName("I");
	  	media17.setDuration(135);
	  	Medialist.add(media17);
	    
		media18 = new Media();
		media18.setId(++mediaIndex);
	  	media18.setLanguage("Tamil");
	  	media18.setPoster("idhu_kathirvelan_kadhal.jpg");
	  	media18.setActors("Stars: Udhayanidhi Stalin, Nayanthara, Chaya Singh");
	  	media18.setSynopsis("The film opens with a prologue, in which a person is being taken to a hospital and the doctor later reporting that the person's condition will be known only after sometime. The scene then shifts a few months back.");
	  	media18.setDirector("Director: S. Prabhakaran");
	  	media18.setName("Idhu Kathirvelan Kadhal");
	  	media18.setDuration(135);
	  	Medialist.add(media18);
	  	
	  	media19 = new Media();
		media19.setId(++mediaIndex);
	  	media19.setLanguage("Tamil");
	  	media19.setPoster("Thalaiva.jpeg");
	  	media19.setActors("Star : 	Vijayr, Amala Paul, Sathyaraj, Abhimanyu Singh, Santhanam");
	  	media19.setSynopsis("Vishwa (Vijay) is a dancer who lives in Sydney, Australia. He also manages a water distribution business there with his childhood friend Logu (Santhanam) and his dance team members. He is the son of Ramadorai (Sathyaraj), a Mumbai-based don who fights for the rights of the Tamil-speaking migrants in the city. Ramadorai had sent Vishwa away to Australia when he was a child for his safety and although they are in regular contact, he lies to Vishwa that he is a businessman.");
	  	media19.setDirector("Director :A. L. Vijay");
	  	media19.setName("Thalaiva");
	  	media19.setDuration(135);
	  	Medialist.add(media19);
	  	
	  	media20 = new Media();
		media20.setId(++mediaIndex);
	  	media20.setLanguage("Tamil");
	  	media20.setPoster("Thillalangadi.jpg");
	  	media20.setActors("Stars: Jeyam Ravi, Tamannaah Bhatia, Shaam");
	  	media20.setSynopsis("An adrenaline junkie walks away from a whirlwind romance and embraces a new life as a thief, though he soon finds himself pursued by veteran police officer and engaged in a turf war with a local gangster.");
	  	media20.setDirector("Director: M. Raja");
	  	media20.setName("Thillalangadi");
	  	media20.setDuration(145);
	  	Medialist.add(media20);
	  	
	}
	
	
	@Override
	public MediaResponse GetMediaListAll(Integer id) {
		
	MediaResponse response = new MediaResponse();
	
	if((id >= 0) && (id <= 4))
	{
		response.setBaseUrl("http://192.162.2.2/filestore/");
		response.setIsfilestorefull(false);
		response.setTotalfilestoresize(17787232);
		response.setAllMedia(Medialist);		
		return response;
	}
	return null;
	}

	@Override
	public Boolean PushMediaObject(MediaRequest request) {
		
		return true;
	}


	@Override
	public PlayListResponse PreparePlayList(Integer id, PlayList list) {

		PlayListResponse response = new PlayListResponse();
		
		if((id >= 0) && (id <= 4))
		{
			if(list != null)
			{
				alllist.add(list);
			}
			else
			{
				response.setName(null);
				response.setResult(false);
				return response;
			}
			response.setName(list.getName());
			response.setResult(true);
			return response;
		}
		return null;
	}


	@Override
	public List<PlayList> ShowPlayList(Integer id) {
		if((id >= 0) && (id <= 4))
		{
			return getAlllist();
		}
		return null;
	}


	@Override
	public PlayListResponse RemovePlayList(String name) {
		// TODO Auto-generated method stub
		Iterator<PlayList> i = alllist.iterator();
		PlayList o = alllist.get(0);
		PlayListResponse response = new PlayListResponse();
		
		if(name != null)
		{
			while (i.hasNext())
			{
				if(o.getName().equals(name))
				{
					response.setName("done");
					response.setResult(true);
					i.remove();
					return response;
				}
				o = i.next();
			}
			response.setName("notfound");
			response.setResult(false);
			return response;
		}
		return null;
	}


	@Override
	public MediaResponse DeleteMediaObject(String name) {
		// TODO Auto-generated method stub
		MediaResponse response = new MediaResponse();
		Iterator<Media> i = Medialist.iterator();
		Media o = Medialist.get(0);
		if(name != null)
		{
			while (i.hasNext())
			{
				System.out.println("names"+o.getName());
				System.out.println("\n");
				if(o.getName().equals(name))
				{
					i.remove();
					response.setAllMedia(Medialist);
					response.setBaseUrl("http://192.162.2.2/filestore/");
					response.setIsfilestorefull(false);
					response.setTotalfilestoresize(17787232);
					return response;
				}
			    o = i.next();
			}
		}
		response.setAllMedia(null);
		response.setBaseUrl(null);
		response.setIsfilestorefull(true);
		response.setTotalfilestoresize(0);
		return response;
	}

}