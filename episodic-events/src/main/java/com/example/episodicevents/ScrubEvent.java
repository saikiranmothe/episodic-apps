package com.example.episodicevents;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ScrubEvent extends Event {
    private final OffsetData data;

    @JsonCreator
    public ScrubEvent(
            @JsonProperty("userId") Long userId,
            @JsonProperty("showId") Long showId,
            @JsonProperty("episodeId") Long episodeId,
            @JsonProperty("createdAt") String createdAt,
            @JsonProperty("data") OffsetData data) {
        super(userId, showId, episodeId, createdAt);
        this.data = data;
    }

    public OffsetData getData() {
        return data;
    }
}