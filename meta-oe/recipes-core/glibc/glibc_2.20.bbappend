FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SRC_URI += " file://0001-ptrace-protect-ptrace_peeksiginfo_args-from-redefint.patch \
             file://0002-fix-build-for-old-libcheader.patch"

SSTATE_DUPWHITELIST += "${STAGING_INCDIR}/netatalk/at.h"