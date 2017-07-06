SUMMARY = "Linear/Logitudinal Time Code (LTC) Library"
HOMEPAGE = "http://x42.github.io/libltc/"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=6a6a8e020838b23406c81b19c1d46df6"

inherit autotools

SRC_URI = "https://github.com/x42/libltc/releases/download/v${PV}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7c95bfbf0240b9ab34dc5730311a8307"
SRC_URI[sha256sum] = "aab1de052bc61fbac6ea66d88f04e95b7d5faa1ef297b95ea6a1a548c87dee5c"

