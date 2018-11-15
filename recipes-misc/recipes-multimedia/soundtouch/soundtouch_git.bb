SUMMARY = "SoundTouch audio tempo/pitch control library"
HOMEPAGE = "http://www.surina.net/soundtouch/index.html"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.TXT;md5=4d2892adf339c4489918ab705d44f66c"

inherit autotools-brokensep pkgconfig gettext

SRC_URI = " \
    git://gitlab.com/${BPN}/${BPN}.git \
    file://0001-Fix-path-to-m4-macro-dir.patch \
"
SRCREV = "b9659b64c692aab50a91da44cc0ea6ba41309949"
PV = "2.1.1"
S = "${WORKDIR}/git"
