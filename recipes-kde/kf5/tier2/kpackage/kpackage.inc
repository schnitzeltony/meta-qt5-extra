SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "2c1dd7b2ecf54a5356e89037977703f9d15970dab0e3ac455f969e6d1741410e"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
