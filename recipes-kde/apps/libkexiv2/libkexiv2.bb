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
SRC_URI[sha256sum] = "5a02a70e7ead0248d9e51fa0521124f66eae1e9042d197f96199f0fdaf02699f"
