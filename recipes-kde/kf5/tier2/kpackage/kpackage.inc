SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPL-2.0+ & LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "b354f3a7e0c6b62513260b0caf5810143647cb21c495d8a1bc3411ee521137a4"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
