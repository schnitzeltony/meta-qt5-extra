SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "BSD-2-Clause & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "55cd87a5437a649c168efbce4af132b992aa67dd9a3a8ced7cff0144f155e1e4"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
