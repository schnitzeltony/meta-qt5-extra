SUMMARY = "Lightweight plotting framework"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "5ed2e16b632ac1dc99a1f278de3ef76f4a2e4bc8989b6876621a9b7a1716ea0e"

DEPENDS += "qttools"

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
