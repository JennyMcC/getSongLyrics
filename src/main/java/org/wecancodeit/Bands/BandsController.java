package org.wecancodeit.Bands;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BandsController {
	
	@Resource
	private BandRepo bandRepo;
	
	@Resource
	private AlbumRepo albumRepo;
	
	@Resource
	private SongRepo songRepo;
	
	@RequestMapping("/bandList")
	public String fetchBand(Model model) {
		model.addAttribute("band", bandRepo.findAll());
		return "bandList";
	}
	
	@RequestMapping("/albumList")
	public String fetchSingleBand(@RequestParam("id") long id, Model model) {
		model.addAttribute(bandRepo.findOne(id));
		return "albumList";
	}
	
	@RequestMapping("/songList")
	public String fetchSingleAlbum(@RequestParam("id") long id, Model model) {
		model.addAttribute(albumRepo.findOne(id));
		return "songList";
	}
	
	@RequestMapping("/songLyrics")
	public String fetchSong(@RequestParam("id") long id, Model model) {
		model.addAttribute(songRepo.findOne(id));
		return "songLyrics";
	}

}
