/**
 * Created by saikiranmothe on 5/18/17.
 */

package com.example.shows;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EpisodesController {

    private EpisodeRepository episodeRespository;

    public EpisodesController(EpisodeRepository episodeRespository) {
        this.episodeRespository = episodeRespository;
    }

    @GetMapping("/shows/{id}/episodes")
    public List<Episode> getEpisodes() {
        List<Episode> episodes = new ArrayList();

        episodeRespository.findAll()
                .forEach(episodes::add);
        return episodes;
    }

    @PostMapping("/shows/{id}/episodes")
    public Episode createEpisode(@RequestBody Episode episode) {
        episode.setShow_id(episode.getShow_id());
        episodeRespository.save(episode);
        return episode;
    }
}


