SUMMARY = "Real-time Midi I/O C++ Library"
HOMEPAGE = "http://www.music.mcgill.ca/~gary/rtmidi/index.html"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=36;endline=61;md5=59cd2daf27733a6f784821dada162c75"

inherit autotools pkgconfig

PACKAGECONFIG ??= "alsa jack"
PACKAGECONFIG[alsa] = "--with-alsa,--without-alsa,alsa-lib"
PACKAGECONFIG[jack] = "--with-jack,--without-jack,jack"

SRC_URI = " \
    http://www.music.mcgill.ca/~gary/${BPN}/release/${BPN}-${PV}.tar.gz \
    file://0001-configure.ac-do-not-run-temp-binary-in-cross-envirno.patch \
    file://0002-configure.ac-do-not-reset-CXXFLAGS.patch \
    file://0003-configure.ac-do-not-add-absolute-prefixes-to-build-f.patch \
"
SRC_URI[md5sum] = "d22e3a5dee972fa0725c420923f1ce65"
SRC_URI[sha256sum] = "d6ee3620236904a1067bd615ff012f1064cbfb389b09ac0b847bbcbd0f565214"
