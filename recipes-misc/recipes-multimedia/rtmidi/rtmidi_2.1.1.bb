SUMMARY = "Real-time Midi I/O C++ Library"
HOMEPAGE = "http://www.music.mcgill.ca/~gary/rtmidi/index.html"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme;beginline=32;endline=59;md5=753303f2b9263cfe9843346bb1f12b1d"

inherit autotools pkgconfig

PACKAGECONFIG ??= "alsa jack"
PACKAGECONFIG[alsa] = "--with-alsa,--without-alsa,alsa-lib"
PACKAGECONFIG[jack] = "--with-jack,--without-jack,jack"

SRC_URI = " \
    http://www.music.mcgill.ca/~gary/${BPN}/release/${BPN}-${PV}.tar.gz \
    file://0001-configure.ac-do-not-run-temp-binary-in-cross-envirno.patch \
"
SRC_URI[md5sum] = "1880adf678501887578c85f2c074f984"
SRC_URI[sha256sum] = "1dd990705fbe003616af9207c5ea2ece2a6212388a41c8b2b2e191055181e286"
