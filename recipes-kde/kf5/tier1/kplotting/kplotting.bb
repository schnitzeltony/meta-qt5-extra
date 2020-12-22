SUMMARY = "Lightweight plotting framework"
LICENSE = "GPL-2.0+ & LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "32226573989c105d84a324174d31a1ed4c7cbf57a75341873cd8fe5692d7a2e8"

DEPENDS += "qttools"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
