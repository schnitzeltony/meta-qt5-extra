SUMMARY = "High quality open source audio plugins for musicians"
HOMEPAGE = "http://calf-studio-gear.org/"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=dcf3c825659e82539645da41a7908589 \
    file://COPYING.GPL;md5=94d55d512a9ba36caa9b7df079bae19f \
"

SRC_URI = " \
    git://github.com/calf-studio-gear/calf.git \
"
SRCREV = "82188d3300fa6ed1084ca8874d6a6b2b74702172"
S = "${WORKDIR}/git"
PV = "0.0.60+git${SRCPV}"
