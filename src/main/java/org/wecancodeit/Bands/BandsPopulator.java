package org.wecancodeit.Bands;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class BandsPopulator implements CommandLineRunner {

	@Resource
	private BandRepo bandRepo;
	
	@Resource
	private AlbumRepo albumRepo;
	
	@Resource 
	private SongRepo songRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Band brandNew = new Band("Brand New", "/images/brandnew.jpg");
		Band incubus = new Band("Incubus", "/images/incubusfish.jpg");
		bandRepo.save(brandNew);
		bandRepo.save(incubus);
		
		Album yourFavoriteWeapon = new Album(brandNew, "Your Favorite Weapon", "The Shower Scene");
		Album dejaEntendu = new Album(brandNew, "Deja Entendu", "Okay I Believe You, but My Tommy Gun Don't");
		albumRepo.save(yourFavoriteWeapon);
		albumRepo.save(dejaEntendu);
		
		Song theShowerScene = new Song(yourFavoriteWeapon, "The Shower Scene", "MANY LYRICS");
		Song okayIBelieveYou = new Song(dejaEntendu, "Okay I Believe You, but My Tommy Gun Don't", "MANY LYRICS");
		songRepo.save(theShowerScene);
		songRepo.save(okayIBelieveYou);
		
		Album morningView = new Album(incubus, "Morning View", "Echo");
		Album makeYourself = new Album(incubus, "Make Yourself", "The Warmth");
		albumRepo.save(morningView);
		albumRepo.save(makeYourself);
		
		Song echo = new Song(morningView, "Echo", "LYRICS");
		Song theWarmth = new Song(makeYourself, "The Warmth", "LYRICS");
		songRepo.save(echo);
		songRepo.save(theWarmth);
	}

}
