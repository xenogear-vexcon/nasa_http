package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaResponse {

//{ "copyright":"\nAlistair Symon\n",
//        "date":"2024-01-23",
//        "explanation":"How well do you know the night sky? OK, but how well can you identify famous sky objects in a very deep image? Either way, here is a test: see if you can find some well-known night-sky icons in a deep image filled with faint nebulosity.  This image contains the Pleiades star cluster, Barnard's Loop, Horsehead Nebula, Orion Nebula, Rosette Nebula, Cone Nebula, Rigel, Jellyfish Nebula, Monkey Head Nebula, Flaming Star Nebula, Tadpole Nebula, Aldebaran, Simeis 147, Seagull Nebula and the California Nebula. To find their real locations, here is an annotated image version.  The reason this task might be difficult is similar to the reason it is initially hard to identify familiar constellations in a very dark sky: the tapestry of our night sky has an extremely deep hidden complexity.  The featured composite reveals some of this complexity in a mosaic of 28 images taken over 800 hours from dark skies over Arizona, USA.",
//        "hdurl":"https://apod.nasa.gov/apod/image/2401/SeagullToCalifornia_Symon_2000.jpg",
//        "media_type":"image",
//        "service_version":"v1",
//        "title":"Deep Nebulas: From Seagull to California",
//        "url":"https://apod.nasa.gov/apod/image/2401/SeagullToCalifornia_Symon_960.jpg"
//}

    private final String copyright;
    private final String date;
    private final String explanation;
    private final String hdurl;
    private final String media_type;
    private final String service_version;
    private final String title;
    private final String url;

    public NasaResponse(
            @JsonProperty("copyright") String copyright,
            @JsonProperty("date") String date,
            @JsonProperty("explanation") String explanation,
            @JsonProperty("hdurl") String hdurl,
            @JsonProperty("media_type") String media_type,
            @JsonProperty("service_version") String service_version,
            @JsonProperty("title") String title,
            @JsonProperty("url") String url
    ) {
        this.copyright = copyright;
        this.date = date;
        this.explanation = explanation;
        this.hdurl = hdurl;
        this.media_type = media_type;
        this.service_version = service_version;
        this.title = title;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
