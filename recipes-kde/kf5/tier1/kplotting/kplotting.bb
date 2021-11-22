SUMMARY = "Lightweight plotting framework"
LICENSE = "GPL-2.0+ & LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "b7b5438bfcf113e13977861644e29871552ec337a100b99d9eba9e5cf6a42a41"

DEPENDS += "qttools"

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
