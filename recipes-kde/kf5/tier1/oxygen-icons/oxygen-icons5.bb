SUMMARY = "KDE oxygen icons"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=6e01bfa20e899e8ad569d5488923cbd2 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[sha256sum] = "741a9b8cedf5e963ef4c7ce7dcc5c6b8ceb86a91828e19c9bcb730c44a82412f"
PV = "${KF5_VERSION}"

FILES:${PN} += " \
    ${datadir}/icons/oxygen \
"

RPROVIDES:${PN} += "oxygen-icons"
RREPLACES:${PN} += "oxygen-icons"
RCONFLICTS:${PN} += "oxygen-icons"
