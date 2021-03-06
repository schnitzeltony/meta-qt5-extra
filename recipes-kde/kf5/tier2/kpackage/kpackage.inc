SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPL-2.0+ & LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "47782782f9cda0d38ab87be340b868cfb9350e3a53b4126d8ea2c33429e173f6"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
