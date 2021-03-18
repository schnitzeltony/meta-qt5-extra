SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPL-2.0+ & LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "90894de985c5acfd7a393787a295d50778a9562ad5d88725e06dc71195e79880"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
