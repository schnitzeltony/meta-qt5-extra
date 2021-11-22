SUMMARY = "Library for Interfacing with Calendars"
LICENSE = "BSD-3-Clause & LGPL-2.0+ & LGPL-3.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-3.0-or-later.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5

DEPENDS += "libical"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "5e13d34179f5e315cf5301286340e52b3dc78d4f48927b7f2f0bbf453f03cc43"
