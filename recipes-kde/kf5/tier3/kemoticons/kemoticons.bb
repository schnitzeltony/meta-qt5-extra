SUMMARY = "Support for emoticons and emoticons themes"
LICENSE = "CC-BY-SA-4.0 & GPL-2.0+ & LGPL-2.0 & LGPL-2.1+ & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC-BY-4.0.txt;md5=28bacf04b75cbad10cb7871e0b063188 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5 gettext

DEPENDS += "karchive kconfig kconfig-native kservice kcoreaddons kcoreaddons-native"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "0b8affb1cd506fcc7a7582b37fac2da68fc45e8f34df32e4f5335fb79af9e549"

FILES_${PN} += " \
    ${datadir}/emoticons \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
