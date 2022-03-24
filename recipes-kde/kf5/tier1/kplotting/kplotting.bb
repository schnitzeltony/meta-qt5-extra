SUMMARY = "Lightweight plotting framework"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "c95d63e2e4c4abbf625ec1cfe749314c1a90dc5be4a90a1ea1617bc969071ed1"

DEPENDS += "qttools"

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
