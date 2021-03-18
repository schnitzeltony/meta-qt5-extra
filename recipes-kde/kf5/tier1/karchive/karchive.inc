SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "BSD-2-Clause & LGPL-2.0 & LGPL-2.0+ & LGPL-3.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "fce08d578c5311c475f43df5c40480ddafbb065c41599c535b5e98d2175c5df5"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
