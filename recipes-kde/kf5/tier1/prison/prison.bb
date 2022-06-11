SUMMARY = "Barcode abstraction layer"
LICENSE = "BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

inherit kde-kf5

DEPENDS += " \
    qrencode \
    libdmtx \
"

SRC_URI[sha256sum] = "99607978559f63dba65d796c5edaf6c54e8aee5d31882d856347ea5ada06d1cb"

PV = "${KF5_VERSION}"
