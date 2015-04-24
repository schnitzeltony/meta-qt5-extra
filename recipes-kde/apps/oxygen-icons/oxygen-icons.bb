SUMMARY = "KDE oxygen icons"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=6e01bfa20e899e8ad569d5488923cbd2 \
"

inherit kde-apps allarch fontcache

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "ebf12a35e36fb633f6251cb3dbdc92a8"
SRC_URI[sha256sum] = "2dd9ad91cdfee785f61389d756dc1777a9f4b552c9486e4b6dc1a6acb8405efb"

FILES_${PN} += " \
    ${datadir}/icons/oxygen \
"
