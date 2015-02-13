SUMMARY = "KDE oxygen icons"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=6e01bfa20e899e8ad569d5488923cbd2 \
"

inherit kde-apps allarch fontcache

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "c15b889622986ff4740c5a216efd577c"
SRC_URI[sha256sum] = "9f0f1130f6677b3405c813af48f022e6a22aa3c54f1cb78b632fee78e8fc8035"

FILES_${PN} += " \
    ${datadir}/icons/oxygen \
"
