SUMMARY = "Libkexiv2 is a wrapper around Exiv2 library"
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
"

inherit kde-apps

DEPENDS += "\
    exiv2 \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "9d8f42e37b52faa111cd3b16a1d902b4d45e25ef976973f9dc527c791b957f40"
