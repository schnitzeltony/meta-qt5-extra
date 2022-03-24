SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "BSD-2-Clause & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "5076a28c3a10ab755454c752fa563a4be7ad890f391c43aaa2ee4ee4b6a99fae"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
