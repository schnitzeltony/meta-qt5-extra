SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "95c78bf322cea2e5a8dfd709be53740e"
SRC_URI[sha256sum] = "436dbda41f854fb538dd172c6f25eed70064b1ab0ab4656479cbe739a2ad1b21"

FILES_${PN} += "${datadir}/wallpapers"
