SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPL-2.0 & LGPL-2.0+ & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "e5a2bb5cd1b6e5f81ce8f5b4d5d94707b3c1acc015bae771368f1f550f688d3d"

FILES_${PN} += "${datadir}/dbus-1"
