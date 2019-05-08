SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "293d855ff8df007a1c75b2a4b0a29c47"
SRC_URI[sha256sum] = "0dc21728f3a08d823106bae7dd99d9b6b28b9b77abe8cf8f213bd4cf5b66b945"

FILES_${PN} += "${datadir}/wallpapers"
