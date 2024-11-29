$(document).ready(function () {
  buildMap();
});

var sw = document.body.clientWidth,
  bp = 550,
  $map = $(".map");
var static =
  "https://maps.google.com/maps/api/staticmap?center=55.7402023,12.5341835&zoom=13&markers=55.7402023,12.5341835&size=640x320&sensor=true";
var embed =
  '<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d15926.706733143681!2d133.76420624437955!3d-3.6609248910088614!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x2d36001ee76518e1%3A0x387f57dde54e3d47!2sKaimana%2C%20Kaimana%20Kota%2C%20Kec.%20Kaimana%2C%20Kabupaten%20Kaimana%2C%20Papua%20Bar.!5e0!3m2!1sid!2sid!4v1732212992796!5m2!1sid!2sid" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>';

function buildMap() {
  if (sw > bp) {
    //If Large Screen
    if ($(".map-container").length < 1) {
      //If map doesn't already exist
      buildEmbed();
    }
  } else {
    if ($(".static-img").length < 1) {
      //If static image doesn't exist
      buildStatic();
    }
  }
}

function buildEmbed() {
  //Build iframe view
  $('<div class="map-container"/>').html(embed).prependTo($map);
}

function buildStatic() {
  //Build static map
  var mapLink = $(".map-link").attr("href"),
    $img = $('<img class="static-img" />').attr("src", static);
  $("<a/>").attr("href", mapLink).html($img).prependTo($map);
}

$(window).resize(function () {
  sw = document.body.clientWidth;
  buildMap();
  google.maps.event.trigger(map, "resize");
});
