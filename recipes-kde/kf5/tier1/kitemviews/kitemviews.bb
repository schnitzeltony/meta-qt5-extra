SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPL-2.0+ & LGPL-2.0 & LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "9702a531799c5f99810beaa64efeb0683d5ae8d4c4933de6906d205f192635c9"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
