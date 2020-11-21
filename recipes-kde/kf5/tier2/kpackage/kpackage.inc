SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2.0+ & LGPLv2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "97791ef08ca18892d6aa6a50fa0a87ae72cad10de9f17e3fb503a370de829772"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
