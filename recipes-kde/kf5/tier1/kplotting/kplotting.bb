SUMMARY = "Lightweight plotting framework"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "46eb996698946d7b0dc60d69674b26a06278a7f8f8eb588504d1b1c423adf565"

DEPENDS += "qttools"

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
