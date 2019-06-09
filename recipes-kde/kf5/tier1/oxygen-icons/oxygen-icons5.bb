SUMMARY = "KDE oxygen icons"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=6e01bfa20e899e8ad569d5488923cbd2 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "195d5230204a19445eb65da7b5f975aa"
SRC_URI[sha256sum] = "506ccbbad21ba9cbb839fe46e979bb79d86cfec6cfcc5cca2a9e2a9ba5f00b2e"

PV = "${KF5_VERSION}"

FILES_${PN} += " \
    ${datadir}/icons/oxygen \
"

RPROVIDES_${PN} += "oxygen-icons"
RREPLACES_${PN} += "oxygen-icons"
RCONFLICTS_${PN} += "oxygen-icons"
