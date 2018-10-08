SUMMARY = "The Synthesis ToolKit in C++"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5f6d67a6d869bcfa305225149e2b4fb"

SRC_URI = " \
    http://ccrma.stanford.edu/software/stk/release/${BPN}-${PV}.tar.gz \
    file://0001-avoid-usr-usr-paths.patch \
    file://0002-configure.ac-fix-shared-library-name.patch \
"
SRC_URI[md5sum] = "87e1b1a24ec09f81321c01f2cdea513d"
SRC_URI[sha256sum] = "3466860901a181120d3bd0407e4aeb5ab24127a4350c314af106778c1db88594"

inherit autotools-brokensep pkgconfig

PACKAGECONFIG ??= "alsa jack"
PACKAGECONFIG[alsa] = "--with-alsa,--without-alsa,alsa-lib"
PACKAGECONFIG[jack] = "--with-jack,--without-jack,jack"

DISABLE_STATIC = ""
EXTRA_OECONF = "--enable-realtime"
