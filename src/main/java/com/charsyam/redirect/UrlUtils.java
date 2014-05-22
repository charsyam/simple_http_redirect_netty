package com.charsyam.redirect;

import java.net.URI;

public class UrlUtils {
  public static String encodedUrl(String url) {
    try {
      URI uri = new URI(url);
      return uri.toASCIIString();
    }catch(Exception e) {
      return url;
    }
  }
}
